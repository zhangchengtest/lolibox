package io.loli.box.service;

import io.loli.box.util.FileBean;

import javax.transaction.Transactional;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * All storage service should implements this interface
 *
 * @author choco
 */
public interface StorageService {

    /**
     * Upload an InputStream with file name
     *
     * @param is          file to upload. After uploaded, file name will be changed to
     *                    nano time.
     * @param filename    origin name of this file
     * @param contentType
     * @return A relative url str generated by storage service
     * @throws IOException Will be throwed while IO error occurred
     */
    public String upload(InputStream is, String filename, String contentType, long length) throws IOException;

    /**
     * Get all File objects of root year folders
     *
     * @return List of File objects
     */
    public List<FileBean> getYears();

    /**
     * Get all File objects of the year folder
     *
     * @param year year to show
     * @return List of File objects
     */
    public List<FileBean> getMonthsByYear(String year);

    /**
     * Get all File objects of the month folder
     *
     * @param year  year to show
     * @param month month to show
     * @return List of File objects
     */
    public List<FileBean> getDaysByMonth(String year, String month);

    /**
     * Get all File objects of the day folder
     *
     * @param year  year to show
     * @param month month to show
     * @param day   day to show
     * @return List of File objects
     * @throws IllegalArgumentException while three params are not illegal
     */
    public List<FileBean> getFilesByDay(String year, String month, String day);

    @Transactional
    public void deleteFile(String name);
}
