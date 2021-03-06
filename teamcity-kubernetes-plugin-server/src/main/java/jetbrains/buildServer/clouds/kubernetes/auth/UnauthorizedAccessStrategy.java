package jetbrains.buildServer.clouds.kubernetes.auth;

import io.fabric8.kubernetes.client.ConfigBuilder;
import jetbrains.buildServer.clouds.kubernetes.connector.KubeApiConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by ekoshkin (koshkinev@gmail.com) on 14.06.17.
 */
public class UnauthorizedAccessStrategy implements KubeAuthStrategy {
    @NotNull
    @Override
    public String getId() {
        return "unauthorized";
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Unauthorized Access";
    }

    @Nullable
    @Override
    public String getDescription() {
        return "Use unauthorized access to Kubernetes API server";
    }

    @NotNull
    @Override
    public ConfigBuilder apply(@NotNull ConfigBuilder clientConfig, @NotNull KubeApiConnection connection) {
        return clientConfig;
    }
}
