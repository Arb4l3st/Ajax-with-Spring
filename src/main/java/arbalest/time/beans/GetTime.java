package arbalest.time.beans;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class GetTime {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss 'от' dd.MM.yyyy");

    public String getDateFormat() {
        return dateFormat.format(new Date());
    }

}
