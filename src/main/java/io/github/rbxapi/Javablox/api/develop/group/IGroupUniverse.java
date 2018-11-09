package io.github.rbxapi.Javablox.api.develop.group;

public interface IGroupUniverse {

    /**
     * Gets a list of universe
     * @param groupId Group Id
     * @param sortOrder Asc/Desc
     * @param limit An integer of array size
     * @param cursor Paging cursor for next/previous pages
     * @return Universes
     */
    String getUniverses(String groupId, String sortOrder, int limit, String cursor);
}
