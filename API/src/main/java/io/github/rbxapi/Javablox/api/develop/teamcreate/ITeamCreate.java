package io.github.rbxapi.Javablox.api.develop.teamcreate;

public interface ITeamCreate {

    /**
     * https://develop.roblox.com/docs#!/TeamCreate/get_v1_universes_universeId_teamcreate
     * @param universeId universe ID
     * @return enabled?
     */
    String isEnabled(double universeId);

    /**
     * https://develop.roblox.com/docs#!/TeamCreate/patch_v1_universes_universeId_teamcreate
     * @param universeId universe ID
     * @param request Enabled?
     * @return Status Code
     */
    String setEnabled(double universeId, String request);
}
