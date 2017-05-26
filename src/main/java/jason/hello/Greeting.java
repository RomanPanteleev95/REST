package jason.hello;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;


public class Greeting {
    @JsonProperty("id") private int id;
    @JsonProperty("content") private String content;

    @JsonCreator
    public Greeting(@JsonProperty("id") int id, @JsonProperty("content") String content){
        this.id = id;
        this.content = content;
    }

    public int getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

    @Override
    public String toString(){
        return "id: " + id + ";\n" + "name: " + content + ";\n";
    }
}
