public class AndroidView implements View {
    Page currentPage;

    @Override
    public void update() {
    }

    public void changeState(Page newPage){
        currentPage = newPage;
    }
}
