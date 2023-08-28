package com.beehyv.dsep.api;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.CancelPostRequest;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.util.SyncJobs;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CancelApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public interface CancelApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }


    /**
     * POST /cancel
     * Cancel an order
     *
     * @param cancelPostRequest TODO (optional)
     * @return Acknowledgement of message received (status code 200)
     * @see CancelApi#cancelPost
     */
    default ResponseEntity<SearchPost200Response> cancelPost(CancelPostRequest cancelPostRequest) {
        SearchPost200Response resp = new SearchPost200Response();
        SearchPost200ResponseMessage msg = SyncJobs.manualCourseUnEnrol(cancelPostRequest.getMessage());
        Ack ack = new Ack();
        ack.setStatus(Ack.StatusEnum.ACK);
        msg.setAck(ack);
        resp.setMessage(msg);
        return ResponseEntity.ok(resp);

    }

}
