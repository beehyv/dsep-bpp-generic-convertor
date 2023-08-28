package com.beehyv.dsep.api;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.model.SupportPostRequest;
import com.beehyv.dsep.service.postfulfillment.SupportService;

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
 * A delegate to be called by the {@link SupportApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public interface SupportApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /support
     * Contact support
     *
     * @param supportPostRequest TODO (optional)
     * @return Acknowledgement of message received (status code 200)
     * @see SupportApi#supportPost
     */
    default ResponseEntity<SearchPost200Response> supportPost(SupportPostRequest supportPostRequest) {
        SearchPost200Response res = new SearchPost200Response();
        SearchPost200ResponseMessage msg = new SearchPost200ResponseMessage();
        Ack ack = new Ack();
        ack.setStatus(Ack.StatusEnum.ACK);
        msg.setAck(ack);
        msg.setConfirmation("Please contact hrmanager@beehyv.com");
        res.setMessage(msg);
        res.setMessage(msg);

        return  ResponseEntity.ok(res);

    }

}
