import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    // Our link we'll send the request to
    public static final String URI = "https://api.nasa.gov/planetary/apod?api_key=L8wikj3KflmG7KD9nBEH1QdqhcwoXWLwhaELp0cb";

    // Entity that will transform the response into our NASA object
    public static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        // Set up our HTTP client that will send requests
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        // Send request and get response
        CloseableHttpResponse response = httpClient.execute(new HttpGet(URI));

        // Convert the response to a Java object NasaObject
        NasaObject nasaObject = mapper.readValue(response.getEntity().getContent(), NasaObject.class);
        System.out.println(nasaObject);

        // Send a request and get a response with our picture
        CloseableHttpResponse pictureResponse = httpClient.execute(new HttpGet(nasaObject.getUrl()));

        // We automatically generate a name for the file
        String[] arr = nasaObject.getUrl().split("/");
        String file = arr[6];

        // Check that our response is not null
        HttpEntity entity = pictureResponse.getEntity();
        if (entity != null) {
            // Save to file
            FileOutputStream fos = new FileOutputStream(file);
            entity.writeTo(fos);
            fos.close();
        }
    }
}
