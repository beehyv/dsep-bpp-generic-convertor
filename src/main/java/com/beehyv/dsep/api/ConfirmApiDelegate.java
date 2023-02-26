package com.beehyv.dsep.api;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.Catalog;
import com.beehyv.dsep.model.Category;
import com.beehyv.dsep.model.Contact;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.Item;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import com.beehyv.dsep.model.SelectPostRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ConfirmApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public interface ConfirmApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /confirm
     * Initialize an order by providing billing and/or shipping details
     *
     * @param selectPostRequest TODO (optional)
     * @return Acknowledgement of message received (status code 200)
     * @see ConfirmApi#confirmPost
     */
    default ResponseEntity<SearchPost200Response> confirmPost(SelectPostRequest selectPostRequest) {
        SearchPost200Response resp = new SearchPost200Response();
        SearchPost200ResponseMessage msg  = new SearchPost200ResponseMessage();
        Catalog catalog = new Catalog();
        Category category = new Category();
        Descriptor categoryDescriptor = new Descriptor();
        categoryDescriptor.setName("Recruitment 2022");
        categoryDescriptor.setLongDesc("For Recruitment of 2022");
        category.setDescriptor(categoryDescriptor);
        Descriptor descriptor = new Descriptor();
        descriptor.setName("Catalog for Beehyv Training Courses");
        catalog.setDescriptor(descriptor);
        msg.setCatalog(catalog);
        Item item = new Item();
        item.setCategoryId("3");
        item.id("90");
        Descriptor itemDescriptor = new Descriptor();
        descriptor.setName("US Placement Test");
        descriptor.setLongDesc("This course is to train user for US placements");
        item.setDescriptor(descriptor);
        Fulfillment fulfillment = new Fulfillment();
        Contact contact = new Contact();
        contact.email("ankit@beehyv.com");
        contact.setPhone("+91 94249 67398");
        fulfillment.setContact(contact);
        fulfillment.setId(UUID.randomUUID().toString());
        fulfillment.setRateable(false);
        fulfillment.setTracking(false);
        Ack ack  = new Ack();
        ack.setStatus(Ack.StatusEnum.ACK);
        msg.setAck(ack);
        msg.setConfirmation("Enrollment Completed");
        resp.setMessage(msg);
        return  ResponseEntity.ok(resp);

    }

}
