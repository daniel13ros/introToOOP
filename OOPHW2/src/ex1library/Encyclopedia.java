//written by daniel rosman 211765565

package ex1library;

import java.util.Objects;

/**
 * Represents an encyclopedia extending from a general publication.
 * Contains details about the encyclopedia's volume number and editor.
 */
public class Encyclopedia extends Publication {

    /**
     * Attributes
     */
    private int volumeNumber;
    private String editor;

    public Encyclopedia(String title, String publication, int quantity, String editor, int volumeNumber) {
        super(title, publication, quantity);
        this.volumeNumber = volumeNumber;
        this.editor = editor;
    }

    /**
     * getters & setters
     */
    public int getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    /**
     * Retrieves the editor of the encyclopedia.
     * If the editor is not specified, returns "unknown".
     *
     * @return The editor of the encyclopedia.
     */
    public String getEditor() {
        if (Objects.equals(editor, "")) {
            return "unknown";
        }
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * Returns a string representation of the encyclopedia.
     *
     * @return String representation of the encyclopedia.
     */
    @Override
    public String toString() {
        return getSerialNumber() + "-" + getKindOfPublication() + "  " + getTitle() + " vol " + getVolumeNumber() + " published by " + getPublication() + " edited by " + getEditor();

    }
}
