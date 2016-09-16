import com.google.api.client.googleapis.GoogleUtils;
import com.google.common.collect.Lists;

import java.util.List;

public class Calculator {
    private final String USES_GOOGLE_API_CLIENT = GoogleUtils.VERSION;
    private final List<String> USES_GUAVA = Lists.newArrayList();

    public int add(int a, int b) { return a + b; }
}

