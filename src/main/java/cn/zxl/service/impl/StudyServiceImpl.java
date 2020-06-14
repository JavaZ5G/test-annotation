package cn.zxl.service.impl;

import cn.zxl.annotation.Study;
import cn.zxl.service.StudyService;

/**
 * @author JavaZ5G
 * @date 2020/5/30 10:57 PM
 */
public class StudyServiceImpl implements StudyService {
    private String value;

    @Study(name = "English")
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    @Study(value = "secondary")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void studyDetail(String name, String value) {
        System.out.println(this.name + this.value);
    }
}
