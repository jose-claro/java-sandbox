package sandbox;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.util.List;

class RecipientsModelTest {

    @Test
    void isPrimary() throws JsonProcessingException {

        String recipientsString = "[]";
        RecipientsModel recipient = new RecipientsModel();

        ObjectMapper om = new ObjectMapper();

        List<RecipientsModel> recipientsList = om.readValue(recipientsString, new TypeReference<List<RecipientsModel>>(){});

        recipient.setName("John Doe");
        recipient.setEmail("jd@bla");
        recipient.setPrimary(true);

        recipientsList.add(recipient);

        System.out.println(om.writeValueAsString(recipientsList));
    }

    @Test
    void setPrimary() {
    }
}