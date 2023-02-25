/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.beehyv.dsep.api;

import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.UpdatePostRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "update", description = "the update API")
@RequestMapping("${openapi.becknCore.base-path:}")
public interface UpdateApi {

    default UpdateApiDelegate getDelegate() {
        return new UpdateApiDelegate() {};
    }

    /**
     * POST /update
     * Remove object
     *
     * @param updatePostRequest TODO (optional)
     * @return Acknowledgement of message received (status code 200)
     */
    @Operation(
        operationId = "updatePost",
        tags = { "Beckn Provider Platform (BPP)" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Acknowledgement of message received", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SearchPost200Response.class))
            })
        },
        security = {
            @SecurityRequirement(name = "GatewaySubscriberAuth"),
            @SecurityRequirement(name = "GatewaySubscriberAuthNew"),
            @SecurityRequirement(name = "SubscriberAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SearchPost200Response> updatePost(
        @Parameter(name = "UpdatePostRequest", description = "TODO") @Valid @RequestBody(required = false) UpdatePostRequest updatePostRequest
    ) {
        return getDelegate().updatePost(updatePostRequest);
    }

}
