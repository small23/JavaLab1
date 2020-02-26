package com.company;

public class AMD extends x86Supported {
    boolean _useSMT;
    boolean _clusterComposition;

    public void setUseSMT(boolean data){_useSMT=data;};
    public boolean getUseSMT(){return _useSMT;};

    public void setClusterComposition(boolean data){_clusterComposition=data;};
    public boolean getClusterComposition(){return _clusterComposition;};
}
