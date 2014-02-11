package org.bahmni.module.referencedatafeedclient.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {
    public static final String TEST_SUFFIX = " (Test)";

    String id;
    String name;
    String description;
    String shortName;
    String resultType;
    Sample sample;
    Department department;
    Boolean isActive = true;

    public Test(String id) {
        this(id, null, null, null, null, null, null, true);
    }

    public Test(String id, String name, String description, String shortName, String resultType, Sample sample, Department department) {
        this(id, name, description, shortName, resultType, sample, department, true);
    }

    public void suffixTestToName() {
        name = name + TEST_SUFFIX;
    }
}
