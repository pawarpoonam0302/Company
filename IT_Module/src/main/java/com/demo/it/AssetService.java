package com.demo.it;

import java.util.List;

public class AssetService {

    private final AssetDao assetDao = new AssetDao();




    public void addAsset(Asset asset) {
        assetDao.assignAssetToEmployee(asset);
        System.out.println("Asset added: " + asset);
    }

    public Asset getAsset(int id) {
        Asset asset = assetDao.readAsset(id);
        if (asset != null) {
            System.out.println("Asset retrieved: " + asset);
        } else {
            System.out.println("Asset with ID " + id + " not found.");
        }
        return asset;
    }


    public List<Asset> getAllAssets() {
        return assetDao.readAllAssets();
    }

    public void updateAsset(Asset asset) {
        assetDao.updateAsset(asset);
        System.out.println("Asset updated: " + asset);
    }

    public void deleteAsset(int id) {
        assetDao.deleteAsset(id);
        System.out.println("Asset with ID " + id + " deleted.");
    }

}
