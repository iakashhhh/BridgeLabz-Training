package bookShelf;

class Book {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return name + " by " + author;
    }
}
