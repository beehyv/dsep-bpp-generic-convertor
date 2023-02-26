package com.beehyv.dsep.service.fulfillment;

import org.json.JSONArray;
import org.json.JSONObject;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.model.StatusPostRequest;
import com.beehyv.dsep.model.TrackPostRequest;
import com.beehyv.dsep.util.PostApi;
import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.CancelPostRequest;
import com.beehyv.dsep.model.Context;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.util.PostApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
public class TrackService {
    public static SearchPost200Response trackService(TrackPostRequest request){

       //TODO this will post an event to Kafka - event listener which will take care of calling on_rating on the gateway with the right params

        
       SearchPost200Response resp = new SearchPost200Response();
       SearchPost200ResponseMessage msg  = new SearchPost200ResponseMessage();
       class Async  implements Runnable {
           @Override
           public void run() {
               try {
                   PostApi.post(createPostRequest(request.getContext(), request.getMessage().getOrderId().getId()), request.getContext().getBapUri().toString());
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
       return  resp;
       

   }

   public static String createPostRequest(Context context, Integer orderId) throws JsonProcessingException {
       JSONObject result = new JSONObject();
       ObjectMapper objectMapper = new ObjectMapper();
       objectMapper.findAndRegisterModules();
       objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
       String contextJSON = objectMapper.writeValueAsString(context);
       JSONObject orderJSON = new JSONObject();
       JSONObject itemJSON = new JSONObject();
       itemJSON.put("id", "3");
       JSONArray itemsArray = new JSONArray();
       itemsArray.put(itemJSON);
       orderJSON.put("id" , orderId);
       orderJSON.put("items" ,itemsArray);
       result.put("context", new JSONObject(contextJSON));
       result.put("order", orderJSON);
       return result.toString();
   }
  

}
