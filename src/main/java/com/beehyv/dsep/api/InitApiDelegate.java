package com.beehyv.dsep.api;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.Catalog;
import com.beehyv.dsep.model.Category;
import com.beehyv.dsep.model.Contact;
import com.beehyv.dsep.model.Context;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Error;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.Item;
import com.beehyv.dsep.model.Order;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.model.SelectPostRequest;
import com.beehyv.dsep.model.Ack.StatusEnum;

import com.beehyv.dsep.util.PostApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.media.ExampleObject;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link InitApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public interface InitApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /init
     * Initialize an order by providing billing and/or shipping details
     *
     * @param selectPostRequest TODO (optional)
     * @return Acknowledgement of message received (status code 200)
     * @see InitApi#initPost
     */
    default ResponseEntity<SearchPost200Response> initPost(SelectPostRequest selectPostRequest) {
        SearchPost200Response resp = new SearchPost200Response();
        SearchPost200ResponseMessage msg  = new SearchPost200ResponseMessage();
        try {
            PostApi.post(createPostRequest(selectPostRequest.getContext(), selectPostRequest.getMessage().getOrder()), selectPostRequest.getContext().getBapUri().toString());
        } catch (Exception e) {
            Ack ack  = new Ack();
            ack.setStatus(Ack.StatusEnum.NACK);
            msg.setAck(ack);
            resp.setMessage(msg);
            return  ResponseEntity.ok(resp);
        }
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
        Fulfillment fulfillment = new Fulfillment();
        Contact contact = new Contact();
        contact.email("ankit@beehyv.com");
        contact.setPhone("+91 94249 67398");
        fulfillment.setContact(contact);
        fulfillment.setId(UUID.randomUUID().toString());
        fulfillment.setRateable(false);
        fulfillment.setTracking(false);
        String fulfilmentJSON = objectMapper.writeValueAsString(fulfillment);
        orderJSON.put("id" ,order.getId());
        orderJSON.put("items" ,itemsArray);
        orderJSON.put("fulfillment" ,fulfilmentJSON);
        result.put("context", contextJSON);
        result.put("order", orderJSON);
        return result.toString();
    }


}
