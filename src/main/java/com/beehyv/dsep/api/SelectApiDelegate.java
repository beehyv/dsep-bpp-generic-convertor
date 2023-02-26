package com.beehyv.dsep.api;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.Catalog;
import com.beehyv.dsep.model.Category;
import com.beehyv.dsep.model.Contact;
import com.beehyv.dsep.model.Context;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Document;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.FulfillmentEnd;
import com.beehyv.dsep.model.FulfillmentStart;
import com.beehyv.dsep.model.Item;
import com.beehyv.dsep.model.Order;
import com.beehyv.dsep.model.Schedule;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.model.SelectPostRequest;
import com.beehyv.dsep.model.Time;
import com.beehyv.dsep.util.PostApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link SelectApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public interface SelectApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /select
     * Select items from the catalog and build your order
     *
     * @param selectPostRequest TODO (optional)
     * @return Acknowledgement of message received (status code 200)
     * @see SelectApi#selectPost
     */
    default ResponseEntity<SearchPost200Response> selectPost(SelectPostRequest selectPostRequest)  {
        SearchPost200Response resp = new SearchPost200Response();
        SearchPost200ResponseMessage msg  = new SearchPost200ResponseMessage();
        class Async  implements Runnable {
            @Override
            public void run() {
                try {
                    PostApi.post(createPostRequest(selectPostRequest.getContext(), selectPostRequest.getMessage().getOrder()), selectPostRequest.getContext().getBapUri().toString());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            };
        }
        Async async = new Async();
        async.run();
        Ack ack  = new Ack();
        ack.setStatus(Ack.StatusEnum.ACK);
        msg.setAck(ack);
        resp.setMessage(msg);
        return  ResponseEntity.ok(resp);
    }

    public default String createPostRequest(Context context, Order order) throws JsonProcessingException {
        JSONObject result = new JSONObject();
        ObjectMapper objectMapper = new ObjectMapper();
        String contextJSON = objectMapper.writeValueAsString(context);
        JSONObject orderJSON = new JSONObject();
        JSONObject itemJSON = new JSONObject();
        itemJSON.put("id", "3");
        JSONArray itemsArray = new JSONArray();
        itemsArray.put(itemJSON);
        orderJSON.put("items" ,itemsArray);
        result.put("context", contextJSON);
        result.put("order", orderJSON);
        return result.toString();
    }

}
