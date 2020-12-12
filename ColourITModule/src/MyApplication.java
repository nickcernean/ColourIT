import javafx.application.Application;
import javafx.stage.Stage;
import model.TaskListModel;
import model.TaskListModelManager;
import view.ViewHandler;

public class MyApplication extends Application {
    public void start(Stage primaryStage){
        TaskListModel model = new TaskListModelManager();
        ViewHandler view = new ViewHandler(model);
        view.start(primaryStage);
    }
}
