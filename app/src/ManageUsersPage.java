public class ManageUsersPage extends AdminPage{
    @Override
    public void goToBack() {
        view.changeState(new AdminPage());
    }
}
