package pro.beam.api.resource.channel;

import pro.beam.api.resource.BeamUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class BeamChannelStatus implements Serializable {
    public ArrayList<BeamUser.Role> roles;
    public FollowsRecord follows;

    public static class FollowsRecord implements Serializable {
        public int user;
        public int channel;
        public Date createdAt;
        public Date updatedAt;
    }
}
