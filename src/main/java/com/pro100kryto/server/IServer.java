package com.pro100kryto.server;

import com.pro100kryto.server.extension.IExtension;
import com.pro100kryto.server.logger.LoggerManager;
import com.pro100kryto.server.service.manager.IServiceManager;
import com.pro100kryto.server.service.manager.IServiceManagerRemote;
import com.pro100kryto.server.service.manager.ServiceManagerRemoteSafe;
import org.jetbrains.annotations.Nullable;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public interface IServer {
    StartStopStatus getStatus();

    Iterable<IExtension> getExtensions();
    @Nullable
    IExtension getExtension(String type);

    LoggerManager getLoggerManager();

    String getSetting(String key);

    String getSettingOrDefault(String key, String defaultVal);

    String getWorkingPath();

    IServiceManager getServiceManager();
    IServiceManagerRemote getServiceManagerRemote(String host, int port)
            throws RemoteException, NotBoundException, ClassCastException;
    ServiceManagerRemoteSafe createServiceManagerRemoteSafe(String host, int port);
}
