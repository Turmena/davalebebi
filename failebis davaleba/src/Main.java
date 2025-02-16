public class Main {
    public static void main(String[] args) {
        FileWriterExample.writeTextToFile();
        WordCounter.countWordsInFile();
        WordSearch.searchWordInFile("შიგან");
        FileCreator.createNewFile();
        FileMerger.mergeFiles();
    }
}
