package com.beehyv.dsep.api;

import com.beehyv.dsep.model.GetCancellationReasonsPostRequest;
import com.beehyv.dsep.model.SearchPost200Response;
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
 * A delegate to be called by the {@link GetFeedbackCategoriesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public interface GetFeedbackCategoriesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /get_feedback_categories
     * Get a list of categories for which feedback can be given by the BAP
     *
     * @param getCancellationReasonsPostRequest Context header is sent as the request (optional)
     * @return Acknowledgement of message received (status code 200)
     * @see GetFeedbackCategoriesApi#getFeedbackCategoriesPost
     */
    default ResponseEntity<SearchPost200Response> getFeedbackCategoriesPost(GetCancellationReasonsPostRequest getCancellationReasonsPostRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : { \"ack\" : { \"status\" : \"ACK\" } }, \"error\" : { \"path\" : \"path\", \"code\" : \"code\", \"type\" : \"CONTEXT-ERROR\", \"message\" : \"message\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
