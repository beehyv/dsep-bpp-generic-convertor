package com.beehyv.dsep.api;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.Error;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.model.SelectPostRequest;
import com.beehyv.dsep.model.Ack.StatusEnum;

import io.swagger.v3.oas.annotations.media.ExampleObject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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
        SearchPost200ResponseMessage msg = new SearchPost200ResponseMessage();
        Ack ack = new Ack();
        ack.setStatus(StatusEnum.ACK);
        msg.setAck(ack);
        Error err = new Error();
        err.setMessage("No error");
        resp.setError(err);
        resp.setMessage(msg);
        return ResponseEntity.ok(resp);
        // getRequest().ifPresent(request -> {
        //     for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        //         if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
        //             String exampleString = "{ \"message\" : { \"ack\" : { \"status\" : \"ACK\" } }, \"error\" : { \"path\" : \"path\", \"code\" : \"code\", \"type\" : \"CONTEXT-ERROR\", \"message\" : \"message\" } }";
        //             ApiUtil.setExampleResponse(request, "application/json", exampleString);
        //             break;
        //         }
        //     }
        // });
        // return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
