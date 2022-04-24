public class ManageFeedbackPage extends AdminPage{
    @Override
    public void goToBack() {
        view.changeState(new AdminPage());
    }
}
