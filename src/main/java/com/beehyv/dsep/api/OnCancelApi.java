/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.beehyv.dsep.api;

import com.beehyv.dsep.model.OnConfirmPostRequest;
import com.beehyv.dsep.model.SearchPost200Response;
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
@Tag(name = "on_cancel", description = "the on_cancel API")
@RequestMapping("${openapi.becknCore.base-path:}")
public interface OnCancelApi {

    default OnCancelApiDelegate getDelegate() {
        return new OnCancelApiDelegate() {};
    }

    /**
     * POST /on_cancel
     * Send cancellation request_id with reasons list in case of cancellation request. Else send cancelled order object
     *
     * @param onConfirmPostRequest TODO (optional)
     * @return Acknowledgement of message received (status code 200)
     */
    @Operation(
        operationId = "onCancelPost",
        tags = { "Beckn App Platform (BAP)" },
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
        value = "/on_cancel",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SearchPost200Response> onCancelPost(
        @Parameter(name = "OnConfirmPostRequest", description = "TODO") @Valid @RequestBody(required = false) OnConfirmPostRequest onConfirmPostRequest
    ) {
        return getDelegate().onCancelPost(onConfirmPostRequest);
    }

}
