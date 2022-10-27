public record Book(String author, String title) {

    @Override
    public String toString(){
        return author + " " + title;
    }
}
