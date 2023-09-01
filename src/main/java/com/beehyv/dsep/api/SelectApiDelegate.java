package com.beehyv.dsep.api;

import com.beehyv.dsep.model.*;
import com.beehyv.dsep.util.SyncJobs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

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
//    default ResponseEntity<SearchPost200Response> selectPost(SelectPostRequest selectPostRequest)  {
//        SearchPost200Response resp = new SearchPost200Response();
//        SearchPost200ResponseMessage msg  = new SearchPost200ResponseMessage();
//        class Async  implements Runnable {
//            @Override
//            public void run() {
//                try {
//                    PostApi.post(createPostRequest(selectPostRequest.getContext(), selectPostRequest.getMessage().getOrder()), selectPostRequest.getContext().getBapUri().toString());
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            };
//        }
//        Async async = new Async();
//        async.run();
//        Ack ack  = new Ack();
//        ack.setStatus(Ack.StatusEnum.ACK);
//        msg.setAck(ack);
//        resp.setMessage(msg);
//        return  ResponseEntity.ok(resp);
//    }
    public default String createPostRequest(Context context, Order order) throws JsonProcessingException, URISyntaxException {
        context.setBapUri(new URI(context.getBapUri().toString() + "/on_select"));
        JSONObject result = new JSONObject();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        objectMapper.findAndRegisterModules();
        String contextJSON = objectMapper.writeValueAsString(context);
        JSONObject orderJSON = new JSONObject();
        JSONObject itemJSON = new JSONObject();
        itemJSON.put("id", "3");
        JSONArray itemsArray = new JSONArray();
        itemsArray.put(itemJSON);
        orderJSON.put("items", itemsArray);
        result.put("context", new JSONObject(contextJSON));
        result.put("order", orderJSON);
        return result.toString();
    }

    default ResponseEntity<OnSelectPostRequest> selectPost(SelectPostRequest selectPostRequest) {
        OnSelectPostRequest resp = new OnSelectPostRequest();
        OnSelectPostRequestMessage msg = SyncJobs.getSelectedCourse(selectPostRequest);
        resp.setMessage(msg);
        return ResponseEntity.ok(resp);
    }
}
