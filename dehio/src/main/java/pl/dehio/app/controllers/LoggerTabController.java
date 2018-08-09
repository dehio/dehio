
package pl.dehio.app.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.springframework.stereotype.Component;
/**
 *
 * @author Przemek
 */
@Component
public class LoggerTabController {

    @FXML private TextArea loggerTxtArea;

    public TextArea getLoggerTxtArea() {
        return loggerTxtArea;
    }
    
}
