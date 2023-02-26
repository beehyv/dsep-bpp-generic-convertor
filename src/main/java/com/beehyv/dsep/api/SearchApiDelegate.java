package com.beehyv.dsep.api;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.model.SearchPostRequest;
import com.beehyv.dsep.util.SyncJobs;
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
 * A delegate to be called by the {@link SearchApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public interface SearchApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /search
     * This allows a user to search for a) Jobs and Internships b) Trainings and Courses c)
     *
     * @param searchPostRequest BAP searches for services (optional)
     * @return Acknowledgement of message received (status code 200)
     * @see SearchApi#searchPost
     */
    default ResponseEntity<SearchPost200Response> searchPost(SearchPostRequest searchPostRequest) {
        SearchPost200Response resp = new SearchPost200Response();
        SearchPost200ResponseMessage msg  = new SearchPost200ResponseMessage();
        Ack ack  = new Ack();
        ack.setStatus(Ack.StatusEnum.ACK);
        msg.setAck(ack);
        msg = SyncJobs.getAllJobs(msg);
        resp.setMessage(msg);
        return ResponseEntity.ok(resp);
    }

}
