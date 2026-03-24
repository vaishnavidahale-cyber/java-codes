class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");

        sb.append(" Vaishnavi");
        System.out.println(sb);

        // StringBuilder is faster (non-synchronized)
        // StringBuffer is thread-safe (synchronized)
    }
}