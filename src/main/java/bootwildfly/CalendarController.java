package bootwildfly;

import bootwildfly.model.entity.EventEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calendar")
public class CalendarController {

    @RequestMapping(value = "events", method = RequestMethod.GET)
    public EventEntity getEvents() {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setTitle("ほげほげ");
        return eventEntity;
    }

}
