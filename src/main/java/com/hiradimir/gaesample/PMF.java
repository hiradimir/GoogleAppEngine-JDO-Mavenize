package com.hiradimir.gaesample;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

/**
 * Created by yutaka on 2015/01/13.
 */
public final class PMF {
    private static final PersistenceManagerFactory pmfInstance = JDOHelper
            .getPersistenceManagerFactory("transactions-optional");

    private PMF() {
    }

    public static PersistenceManagerFactory get() {
        return pmfInstance;
    }

    public static PersistenceManager persistenceManager() {
        return pmfInstance.getPersistenceManager();
    }


    public static class CRUD{

    }
    
}