
# Bandwidth Messages List

## Structure

`BandwidthMessagesList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | Total number of messages matched by the search | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `PageInfo` | [`PageInfo`](/doc/Messaging/models/page-info.md) | Optional | - | PageInfo getPageInfo() | setPageInfo(PageInfo pageInfo) |
| `Messages` | [`List<BandwidthMessageItem>`](/doc/Messaging/models/bandwidth-message-item.md) | Optional | - | List<BandwidthMessageItem> getMessages() | setMessages(List<BandwidthMessageItem> messages) |

## Example (as JSON)

```json
{
  "totalCount": null,
  "pageInfo": null,
  "messages": null
}
```

