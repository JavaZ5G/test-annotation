package cn.zxl.service;

/**
 * @author JavaZ5G
 * @date 2020/5/30 10:59 PM
 */
public interface StudyService {
    void setName(String name);

    String getName();

    void setValue(String value);

    String getValue();

    void studyDetail(String name, String value);
}
