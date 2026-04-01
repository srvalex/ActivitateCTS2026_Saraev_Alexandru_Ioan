package Singleton.MemorieCache.Cache;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CacheMemory {

    private final String nameCPU;
    private float size;
    private List<Object> cacheRegisty;
    private static CacheMemory cacheMemoryIntance = null;

    private CacheMemory(String nameCPU, float size) {
        this.nameCPU = nameCPU;
        this.size = size;
        this.cacheRegisty = new ArrayList<>();
    }

    private CacheMemory() {
        this.nameCPU = "Intel Pentium 4";
        this.size = 8f;
        this.cacheRegisty = new ArrayList<>();
    }

    public static synchronized CacheMemory getCacheMemoryIntance(String numeCPU, float size){
        if(cacheMemoryIntance == null) {
            cacheMemoryIntance = new CacheMemory(numeCPU,size);
            return cacheMemoryIntance;
        } else {
            return cacheMemoryIntance;
        }
    }

    public static synchronized CacheMemory getCacheMemoryIntance(){
        if(cacheMemoryIntance == null) {
            cacheMemoryIntance = new CacheMemory();
            return cacheMemoryIntance;
        } else {
            return cacheMemoryIntance;
        }
    }

    public void storeData(Object object) {
        cacheRegisty.add(object);
    }

    public Object popDataFromCache(int index) {
        Object extractedData = cacheRegisty.get(index-1);
        return extractedData;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CacheMemory{");
        sb.append("nameCPU='").append(nameCPU).append('\'');
        sb.append(", size=").append(size);
//        sb.append(", cacheRegisty=").append(cacheRegisty);
        sb.append('}');
        return sb.toString();
    }
}
