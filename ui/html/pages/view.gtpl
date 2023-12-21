{{define "title"}}Snippet #{{.Snippet.ID}}{{ end }}

{{define "main"}}
{{ with .Snippet }}
<div class="snippet">
    <div class="metadata">
        <strong>{{.Title}}</strong>
        <span>#{{.ID}}</span>
    </div>
    <pre><code>{{.Content}}</code></pre>
    <div class="metadata">
        <time>Created: {{humanDate .Created}}</time>
        <time>Expires: {{humanDate .Expires}}</time>
    </div>
</div>
{{ end }}
{{ end }}