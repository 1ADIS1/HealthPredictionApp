public abstract class Page {
    protected AndroidView view;

    abstract void goToBack();
    abstract void goToAdmin();
    abstract void goToDoctor();
    abstract void goToFeedback();
    abstract void goToSettings();
    abstract void goToAnalysis();
    abstract void draw();
}
