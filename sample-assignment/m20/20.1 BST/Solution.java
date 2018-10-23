/**
 * Class for book.
 */
class Book implements Comparable<Book> {
    /**
     * Name string.
     */
    private String name;
    /**
     * Author of book.
     */
    private String author;
    /**
     * Price of the book.
     */
    private String price;
    /**
     * Constructs the object.
     *
     * @param      name1    The name 1
     * @param      author1  The author 1
     * @param      price1   The price 1
     */
    Book(final String name1, final String author1, final String price1) {
        this.name = name1;
        this.author = author1;
        this.price = price1;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    String getName() {
        return name;
    }
    /**
     * Gets the author.
     *
     * @return     The author.
     */
    String getAuthor() {
        return author;
    }
    /**
     * Gets the price.
     *
     * @return     The price.
     */
    Double getPrice() {
        return Double.parseDouble(price);
    }
    /**
     * Compares the name of the books.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Book that) {
        return this.name.compareTo(that.name);
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return getName() + ", " + getAuthor() + ", " + getPrice();
    }
}
/**
 * Class for node.
 */
class Node {
    /**
     * Keys in book format.
     */
    private Book key;
    /**
     * Values in a string.
     */
    private String value;
    /**
     * Left and right nodes.
     */
    private Node left, right;
    /**
     * Count of the insertions for each and every node.
     */
    private int count;
}
