package com.runvision.bean;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.runvision.bean.RecognitionRecord;
import com.runvision.bean.SocketRecord;

import com.runvision.bean.RecognitionRecordDao;
import com.runvision.bean.SocketRecordDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig recognitionRecordDaoConfig;
    private final DaoConfig socketRecordDaoConfig;

    private final RecognitionRecordDao recognitionRecordDao;
    private final SocketRecordDao socketRecordDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        recognitionRecordDaoConfig = daoConfigMap.get(RecognitionRecordDao.class).clone();
        recognitionRecordDaoConfig.initIdentityScope(type);

        socketRecordDaoConfig = daoConfigMap.get(SocketRecordDao.class).clone();
        socketRecordDaoConfig.initIdentityScope(type);

        recognitionRecordDao = new RecognitionRecordDao(recognitionRecordDaoConfig, this);
        socketRecordDao = new SocketRecordDao(socketRecordDaoConfig, this);

        registerDao(RecognitionRecord.class, recognitionRecordDao);
        registerDao(SocketRecord.class, socketRecordDao);
    }
    
    public void clear() {
        recognitionRecordDaoConfig.clearIdentityScope();
        socketRecordDaoConfig.clearIdentityScope();
    }

    public RecognitionRecordDao getRecognitionRecordDao() {
        return recognitionRecordDao;
    }

    public SocketRecordDao getSocketRecordDao() {
        return socketRecordDao;
    }

}
