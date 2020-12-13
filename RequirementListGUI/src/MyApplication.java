import javafx.application.Application;
import javafx.stage.Stage;
import model.RequirementList;
import model.RequirementListModel;
import model.RequirementListModelManager;
import view.ViewHandler;

public class MyApplication extends Application {
    public void start(Stage primaryStage){
        RequirementListModel model = new RequirementListModelManager();
        ViewHandler view = new ViewHandler(model);
        view.start(primaryStage);
    }
}
