package ekoshkin.teamcity.clouds.kubernetes.podSpec;

import ekoshkin.teamcity.clouds.kubernetes.KubeCloudImage;
import ekoshkin.teamcity.clouds.kubernetes.connector.KubeApiConnection;
import io.fabric8.kubernetes.api.model.Pod;
import jetbrains.buildServer.clouds.CloudInstanceUserData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by ekoshkin (koshkinev@gmail.com) on 15.06.17.
 */
public class CustomTemplatePodSpecProvider implements PodSpecProvider {
    @NotNull
    @Override
    public String getId() {
        return "custom-pod-template";
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Use custom pod template";
    }

    @Nullable
    @Override
    public String getDescription() {
        return null;
    }

    @NotNull
    @Override
    public Pod getPodTemplate(@NotNull CloudInstanceUserData cloudInstanceUserData, @NotNull KubeCloudImage kubeCloudImage, @NotNull KubeApiConnection kubeApiConnection) {
        return null;
    }
}