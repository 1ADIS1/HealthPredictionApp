public class ManageDatasetPage extends AdminPage{
    @Override
    public void goToBack() {
        view.changeState(new AdminPage());
    }
}
