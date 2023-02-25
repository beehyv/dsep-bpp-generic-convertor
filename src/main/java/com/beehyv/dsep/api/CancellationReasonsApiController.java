package com.beehyv.dsep.api;

import com.beehyv.dsep.model.CancellationReasonsPostRequest;
import com.beehyv.dsep.model.SearchPost200Response;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
@Controller
public class CancellationReasonsApiController implements CancellationReasonsApi {

    private final CancellationReasonsApiDelegate delegate;

    public CancellationReasonsApiController(@Autowired(required = false) CancellationReasonsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CancellationReasonsApiDelegate() {});
    }

    @Override
    public CancellationReasonsApiDelegate getDelegate() {
        return delegate;
    }

}
