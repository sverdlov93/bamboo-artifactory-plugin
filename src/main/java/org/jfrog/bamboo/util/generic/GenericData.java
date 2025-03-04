package org.jfrog.bamboo.util.generic;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.jfrog.build.extractor.ci.BuildInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.jfrog.build.api.BuildBean.ROOT;

/**
 * This class goal is to represent JSON structure that will be share between
 * the Generic Resolve and Generic Deploy tasks.
 *
 * @author Lior Hasson
 */

@XStreamAlias(ROOT)
public class GenericData implements Serializable {

    @XStreamAlias("build")
    private List<BuildInfo> builds;

    public List<BuildInfo> getBuilds() {
        return builds;
    }

    public void setBuilds(List<BuildInfo> builds) {
        this.builds = builds;
    }

    public void addBuild(BuildInfo build) {
        if (this.builds == null) {
            this.builds = new ArrayList<>();
        }
        this.builds.add(build);
    }
}
