package org.bahmni.module.bahmnicore.dao.impl;

import org.bahmni.module.bahmnicore.dao.ApplicationDataDirectory;
import org.openmrs.util.OpenmrsUtil;

import java.io.File;

public class ApplicationDataDirectoryImpl implements ApplicationDataDirectory {

    @Override
    public File getFile(String relativePath) {
        String applicationDataDirectory = OpenmrsUtil.getApplicationDataDirectory();
        if (!applicationDataDirectory.endsWith(File.separator) && !relativePath.startsWith(File.separator)) {
            applicationDataDirectory += File.separator;
        }
        return new File(applicationDataDirectory + relativePath);
    }

    @Override
    public File getFileFromConfig(String relativePath) {
        return new File(OpenmrsUtil.getApplicationDataDirectory(),"bahmni_config"+ File.separator+relativePath);
    }
}
