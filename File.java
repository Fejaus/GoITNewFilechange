package com.goit.gojavaonline;

import java.util.List;

/**
 * Created by User on 5/27/2016.
 */
public class File{
    public static void main (String[]args){
        System.out.println("All file in directory");
    }
    
    List<FileTxt> fileTxt;
    List<FileImg> fileImg;
    List<FileAudio> fileAudio;

    public void setFileTxt(List<FileTxt> fileTxt) {
        this.fileTxt = fileTxt;
    }

    public List<FileTxt> getFileTxt() {
        return fileTxt;
    }

    public void setFileImg(List<FileImg> fileImg) {
        this.fileImg = fileImg;
    }

    public List<FileImg> getFileImg() {
        return fileImg;
    }

    public void setFileAudio(List<FileAudio> fileAudio) {
        this.fileAudio = fileAudio;
    }

    public List<FileAudio> getFileAudio() {
        return fileAudio;
    }
}


