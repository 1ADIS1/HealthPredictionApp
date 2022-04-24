public class ManageDoctorsPage extends AdminPage{
    @Override
    public void goToBack() {
        view.changeState(new AdminPage());
    }
}
