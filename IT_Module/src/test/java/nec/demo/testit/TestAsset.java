package nec.demo.testit;

import com.demo.database.DatabaseConnection;
import com.demo.it.Asset;
import com.demo.it.AssetDao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;


class TestAsset {

  private static AssetDao assetDao;

  private static Connection connection;

  @BeforeAll
 public static void setupDatabase()  {

      connection = DatabaseConnection.getConnection();
      assetDao = new AssetDao(connection);

  }



  @Test
 public void testCreateAsset()  {
      Asset newAsset = new Asset(267, 350, "Dell Latitude345");
      assetDao.assignAssetToEmployee(newAsset);

      Asset fetchedAsset = assetDao.readAsset(349);
      assertNotNull(fetchedAsset);
      assertEquals(267, fetchedAsset.getAssignedEmployeeId());
      assertEquals("Dell Latitude345", fetchedAsset.getAssetName());

  }

  @Test
public void testReadAsset()  {
      Asset asset = assetDao.readAsset(348);
      assertNotNull(asset);
      assertEquals(267, asset.getAssignedEmployeeId());
      assertEquals("Dell Latitude345", asset.getAssetName());
  }

//    @Test
//    void testReadAllAssets() throws Exception {
//        Asset newAsset = new Asset(2, 45, "Furniture");
//        assetDao.assignAssetToEmployee(newAsset);
//
//        List<Asset> assets = assetDao.readAllAssets();
//        assertEquals(15, assets.size());
//    }



  @Test
 public void testDeleteAsset()  {
      assetDao.deleteAsset(117);
      Asset deletedAsset = assetDao.readAsset(117);
      assertNull(deletedAsset);
  }
}