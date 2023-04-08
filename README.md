# Silicon Resource API  

Silicon resource API contains classes  
to import XML/File data into Silicon framework.  

### Example:  

```java
public class MyApp extends SiliconApplication
{
    public void onInitialize(Settings settings)    
    {
        settings.resourceManager 
                = new ResourceManager(/* resource dir */);
        
        // Fetch resource
        settings.resourceManager.getResource("resource.txt");
        // Or
        SiliconApplication.getResource("resource.txt");
    }
}
```